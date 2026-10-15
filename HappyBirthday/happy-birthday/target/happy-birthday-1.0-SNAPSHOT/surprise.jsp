
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>A Special Surprise ❤️</title>
    <link rel="stylesheet" href="style.css">

    <style>
        .surprise-card {
            width: min(100%, 680px);
            padding: clamp(28px, 7vw, 60px) clamp(20px, 6vw, 52px);
            text-align: center;
            border: 1px solid rgba(255, 217, 138, .4);
            border-radius: 30px;
            background: linear-gradient(
                145deg,
                rgba(255, 117, 181, .13),
                rgba(255, 255, 255, .055)
            );
            box-shadow: 0 25px 90px rgba(0, 0, 0, .3);
            backdrop-filter: blur(16px);
            animation: reveal 900ms ease-out both;
        }

        @keyframes reveal {
            from {
                opacity: 0;
                transform: scale(.92) translateY(20px);
            }
            to {
                opacity: 1;
                transform: scale(1) translateY(0);
            }
        }

        .heart {
            display: block;
            margin-bottom: 18px;
            font-size: clamp(4rem, 15vw, 6rem);
            filter: drop-shadow(0 0 22px rgba(255, 117, 181, .4));
            animation: heartbeat 1.5s ease-in-out infinite;
        }

        @keyframes heartbeat {
            0%, 100% { transform: scale(1); }
            15% { transform: scale(1.12); }
            30% { transform: scale(1); }
            45% { transform: scale(1.08); }
        }

        .surprise-title {
            margin: 0;
            font-size: clamp(2.3rem, 8vw, 4.2rem);
            line-height: 1.15;
            background: linear-gradient(100deg, #fff8ff, #ffacd2, #ffd98a);
            background-clip: text;
            -webkit-background-clip: text;
            color: transparent;
        }

        .surprise-subtitle {
            margin: 18px 0 25px;
            color: var(--gold);
            font-size: 1.05rem;
            font-weight: 600;
        }

        .personal-message {
            margin: 0 auto 30px;
            max-width: 500px;
            color: var(--muted);
            font-size: clamp(.95rem, 3vw, 1.08rem);
            line-height: 2;
            white-space: pre-line;
            overflow-wrap: anywhere;
        }

        .signature {
            margin: 0 0 30px;
            color: var(--pink);
            font-family: 'Dancing Script', cursive;
            font-size: clamp(1.8rem, 6vw, 2.6rem);
            font-weight: 700;
        }

        .surprise-actions {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 12px;
        }

        .secondary-button {
            display: inline-flex;
            align-items: center;
            justify-content: center;
            min-height: 52px;
            padding: 13px 22px;
            border: 1px solid rgba(255, 255, 255, .25);
            border-radius: 999px;
            color: var(--white);
            background: rgba(255, 255, 255, .08);
            text-decoration: none;
            font-weight: 600;
            cursor: pointer;
        }

        .secondary-button:hover {
            background: rgba(255, 255, 255, .15);
        }

        @media (max-width: 480px) {
            .surprise-card {
                border-radius: 24px;
            }

            .surprise-actions {
                flex-direction: column;
            }

            .surprise-actions a,
            .surprise-actions button {
                width: 100%;
            }
        }
    </style>
</head>
<body>

    <main class="birthday-page">
        <div class="stars" aria-hidden="true"></div>

        <section class="surprise-card">
            <span class="heart" role="img" aria-label="Heart">💖</span>

            <p class="eyebrow">✨ YOUR REAL GIFT ✨</p>

            <h1 class="surprise-title">
                You Chose Wisely!
            </h1>

            <p class="surprise-subtitle">
                Congratulations! You unlocked the premium brother package. 😂
            </p>

            <div class="personal-message" id="personalMessage"></div>

            <p class="signature">
                With love, your favourite brother ❤️
            </p>

            <div class="surprise-actions">
                <a class="primary-button"
                   href="https://wa.me/?text=Happy%20Birthday!%20%F0%9F%8E%82%20Sending%20you%20lots%20of%20love!">
                    Share on WhatsApp 💌
                </a>

                <a class="secondary-button" href="index.jsp">
                    Relive the Surprise 🎂
                </a>
            </div>
        </section>
    </main>

    <script>
        /*
         * PERSONALIZE YOUR MESSAGE HERE.
         * Replace the text between the backticks with your own message.
         * Keep the backticks.
         */
        const birthdayMessage = `Dear Siddhi,

Happy Birthday! 🎂❤️

May your life always be filled with happiness,
success, laughter, and wonderful memories.

And remember: your brother's blessings are priceless.
The Louis Vuitton bag and Rolls-Royce are still pending
due to a small financial misunderstanding. 😂

Stay happy, keep smiling, and have an amazing year ahead!`;

        document.getElementById("personalMessage").textContent =
            birthdayMessage;
    </script>

</body>
</html>
