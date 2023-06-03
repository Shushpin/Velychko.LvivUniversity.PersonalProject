<!DOCTYPE html>
<html lang="en">
<head>
    <link>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible"
          content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="../static/style.css">

</head>
<body>
<header>
    <a href="/fscreen" class="navbar-brand">Calorie Tracker</a>

    <nav>
        <ul>

            <li><a href="/calorie">Calorie Calculator</a></li>
            <li><a href="#">button2</a></li>
            <li><a href="#">About &Congruent;</a>
                <ul>
                    <li><a href=mailto: denusveluchko2017@gmail.com>Gmail</a></li>
                    <li><a href="https://github.com/Shushpin/Velychko.LvivUniversity.PersonalProject">GitHub</a></li>
                    <li><a href="#">Contacts =</a>
                        <ul>
                            <li><a href="https://www.instagram.com/velychko_d">Instagram</a></li>
                            <li><a href="https://t.me/gamabunta429">Telegram</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li><a href="/faq">FAQs</a></li>
            <li><a href="/login">Log out</a></li>
        </ul>
    </nav>
</header>
<div class="bmr-calculator">
    <h2>BMR Calculator</h2>
    <div class="controls">
        <form>
            <h3>Age</h3>
            <input type="text" id="age" value="" />

            <div class="gender">
                <h3>Gender</h3>

                <input type="radio" id="male" value="male" name="gender" checked/>
                <label for="male">Male</label>

                <input type="radio" id="female" value="female" name="gender"/>
                <label for="female">Female</label>

                <div class="height">
                    <h3>Height</h3>
                    <input type="text" id="height" value="" />
                    <div class="unit">cm</div>
                </div>

                <div class="weight">

                    <h3>Weight</h3>
                    <input type="text" id="weight" value="">
                    <div class="unit">kg</div>
                </div>
            </div>
        </form>
    </div>
    <div class="result">
        <button class="calculate-btn">Calculate</button>
        <div class="result-massage"><span class="calories"></span>
            Calories/day
        </div>
    </div>
</div>



<script src="/main.js"></script>
</body>
</html>