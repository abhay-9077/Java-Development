
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Birthday Gift 🎁</title>
    <link rel="stylesheet" href="style.css">
    <style>
        .gift-card {
            width: min(100%, 720px);
            padding: clamp(25px, 6vw, 45px);
            text-align: center;
            border: 1px solid rgba(255,255,255,.18);
            border-radius: 28px;
            background: rgba(255,255,255,.08);
            box-shadow: 0 24px 80px rgba(0,0,0,.25);
            backdrop-filter: blur(16px);
        }

        .gift-title {
            margin: 0;
            font-size: clamp(2rem, 7vw, 3.5rem);
            line-height: 1.2;
            background: linear-gradient(100deg, #fff8ff, #ffacd2, #ffd98a);
            background-clip: text;
            -webkit-background-clip: text;
            color: transparent;
        }

        .gift-intro {
            margin: 15px auto 28px;
            max-width: 470px;
            color: var(--muted);
            line-height: 1.8;
        }

        .gift-grid {
            display: grid;
            grid-template-columns: 1fr;
            gap: 14px;
            margin: 25px 0;
        }

        .gift-option {
            position: relative;
            width: 100%;
            min-height: 76px;
            display: flex;
            align-items: center;
            gap: 15px;
            padding: 15px 18px;
            border: 1px solid rgba(255,255,255,.17);
            border-radius: 18px;
            color: var(--white);
            background: rgba(255,255,255,.07);
            text-align: left;
            cursor: pointer;
            touch-action: manipulation;
        }

        .gift-option .gift-icon {
            flex-shrink: 0;
            font-size: 2rem;
        }

        .gift-option .gift-label {
            font-weight: 600;
        }

        .gift-option .gift-hint {
            display: block;
            margin-top: 4px;
            color: var(--muted);
            font-size: .76rem;
            font-weight: 400;
        }

        .gift-option.escape-gift {
            border-color: rgba(255,117,181,.35);
            transition: background 150ms ease;
        }

        .gift-option.escape-gift:hover {
            background: rgba(255,117,181,.13);
        }

        .gift-option.blessing-gift {
            border: 1px solid rgba(255,217,138,.65);
            background: linear-gradient(
                100deg,
                rgba(255,117,181,.17),
                rgba(255,217,138,.12)
            );
            cursor: pointer;
        }

        .gift-option.blessing-gift:hover {
            background: linear-gradient(
                100deg,
                rgba(255,117,181,.27),
                rgba(255,217,138,.22)
            );
        }

        .gift-option:focus-visible {
            outline: 3px solid white;
            outline-offset: 4px;
        }

        .gift-message {
            min-height: 24px;
            color: var(--gold);
            font-size: .9rem;
            font-weight: 600;
        }

        .gift-back {
            display: inline-block;
            margin-top: 8px;
            color: var(--muted);
            font-size: .85rem;
            text-decoration: none;
        }

        .gift-back:hover {
            color: white;
        }

        @media (min-width: 560px) {
            .gift-grid {
                grid-template-columns: 1fr 1fr;
            }
        }
    </style>
</head>
<body>

    <main class="birthday-page">
        <div class="stars" aria-hidden="true"></div>

        <section class="gift-card">
            <p class="eyebrow">🎁 THE BIRTHDAY GIFT SHOP 🎁</p>

            <h1 class="gift-title">Choose Your Gift!</h1>

            <p class="gift-intro">
                Pick your dream gift, and your incredibly generous
                brother will arrange it for you. No limits.
                Absolutely no limits. 😇
            </p>

            <div class="gift-grid" id="giftGrid">

                <button class="gift-option escape-gift" type="button">
                    <span class="gift-icon">👜</span>
                    <span>
                        <span class="gift-label">Louis Vuitton Bag</span>
                        <span class="gift-hint">A tiny gift for a tiny budget. 😂</span>
                    </span>
                </button>

                <button class="gift-option escape-gift" type="button">
                    <span class="gift-icon">👔</span>
                    <span>
                        <span class="gift-label">Prada Outfit</span>
                        <span class="gift-hint">Your brother is basically a billionaire.</span>
                    </span>
                </button>

                <button class="gift-option escape-gift" type="button">
                    <span class="gift-icon">🚘</span>
                    <span>
                        <span class="gift-label">Rolls-Royce + Rolex</span>
                        <span class="gift-hint">Choose the car colour! (In your dreams.)</span>
                    </span>
                </button>

                <button
                    class="gift-option blessing-gift"
                    type="button"
                    onclick="window.location.href='surprise.jsp'">
                    <span class="gift-icon">❤️</span>
                    <span>
                        <span class="gift-label">Blessings from Your Great Brother</span>
                        <span class="gift-hint">Priceless. Exclusive. Actually available. ✨</span>
                    </span>
                </button>

            </div>

            <p class="gift-message" id="giftMessage" aria-live="polite">
                Psst... try choosing any gift you like. 👀
            </p>

            <a class="gift-back" href="index.jsp">← Back to birthday wishes</a>
        </section>
    </main>

    <script>
        const escapeGifts = document.querySelectorAll(".escape-gift");
        const giftMessage = document.getElementById("giftMessage");

        const funnyMessages = [
            "Too expensive! Catch it if you can! 😂",
            "Your brother's bank account said NOPE! 🏃",
            "Error 404: Rich brother not found. 💸",
            "That gift is running faster than your brother! 🤣",
            "Nice try! Pick something within the budget. 😇"
        ];

        escapeGifts.forEach((gift) => {
            let moveCount = 0;

            function escape() {
                moveCount++;

                const maxX = Math.max(0, window.innerWidth - gift.offsetWidth - 24);
                const maxY = Math.max(0, window.innerHeight - gift.offsetHeight - 24);

                const x = Math.random() * maxX;
                const y = Math.random() * maxY;

                gift.style.position = "fixed";
                gift.style.left = x + "px";
                gift.style.top = y + "px";
                gift.style.width = Math.min(gift.offsetWidth, window.innerWidth - 24) + "px";
                gift.style.zIndex = "1000";
                gift.style.boxShadow = "0 12px 35px rgba(0,0,0,.35)";

                giftMessage.textContent =
                    funnyMessages[Math.floor(Math.random() * funnyMessages.length)];
            }

            gift.addEventListener("pointerdown", (event) => {
                event.preventDefault();
                escape();
            });

            gift.addEventListener("click", (event) => {
                event.preventDefault();
                escape();
            });

            gift.addEventListener("pointerenter", () => {
                if (window.matchMedia("(hover: hover)").matches) {
                    escape();
                }
            });
        });
    </script>

</body>
</html>
