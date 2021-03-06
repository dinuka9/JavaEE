<html>
    <head>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css">
        <style type="text/css">
            @import url(https://fonts.googleapis.com/css?family=Roboto:300);

            .login-page {
                width: 400px;
                padding: 2% 0 0;
                margin: auto;
            }

            .materialbox {
                position: relative;
                z-index: 1;
                background: #FFFFFF;
                max-width: 360px;
                margin: 0 auto 10px;
                padding: 20px;
                text-align: center;
                box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0
                    rgba(0, 0, 0, 0.24);
            }

            .materialbox input {
                font-family: "Roboto", sans-serif;
                outline: 0;
                background: #f2f2f2;
                width: 100%;
                border: 0;
                margin: 0 0 15px;
                padding: 15px;
                box-sizing: border-box;
                font-size: 14px;
            }

            .materialbox button {
                font-family: "Roboto", sans-serif;
                text-transform: uppercase;
                outline: 0;
                background: #4CAF50;
                width: 100%;
                border: 0;
                padding: 15px;
                color: #FFFFFF;
                font-size: 14px;
                -webkit-transition: all 0.3 ease;
                transition: all 0.3 ease;
                cursor: pointer;
            }

            .materialbox button:hover, .materialbox button:active, .materialbox button:focus {
                background: #43A047;
            }

            .materialbox .message {
                margin: 15px 0 0;
                color: #b3b3b3;
                font-size: 12px;
            }

            .materialbox .message a {
                color: #4CAF50;
                text-decoration: none;
            }

            .materialbox .register-form {
                display: none;
            }

            .container {
                position: relative;
                z-index: 1;
                max-width: 300px;
                margin: 0 auto;
            }

            .container:before, .container:after {
                content: "";
                display: block;
                clear: both;
            }

            .container .info {
                margin: 50px auto;
                text-align: center;
            }

            .container .info h1 {
                margin: 0 0 15px;
                padding: 0;
                font-size: 36px;
                font-weight: 300;
                color: #1a1a1a;
            }

            .container .info span {
                color: #4d4d4d;
                font-size: 12px;
            }

            .container .info span a {
                color: #000000;
                text-decoration: none;
            }

            .container .info span .fa {
                color: #EF3B3A;
            }

            .errormessage{
                color: #EF3B3A;
                margin-bottom: 20px;
            }

            body {
                background: #76b852; /* fallback for old browsers */
                background: -webkit-linear-gradient(right, #76b852, #8DC26F);
                background: -moz-linear-gradient(right, #76b852, #8DC26F);
                background: -o-linear-gradient(right, #76b852, #8DC26F);
                background: linear-gradient(to left, #76b852, #8DC26F);
                font-family: "Roboto", sans-serif;
                -webkit-font-smoothing: antialiased;
                -moz-osx-font-smoothing: grayscale;
            }
        </style>
        <script type="text/javascript">
            $('.message a').click(function () {
                $('form').animate({
                    height: "toggle",
                    opacity: "toggle"
                }, "slow");
            });
        </script>
    </head>
    <body>
        
        <div class="login-page">
            <h3 align="center" style="color: #ffffff; font-size: 30px">Employee Management System</h3>
            <div class="materialbox">
                <div class="errormessage"> ${error}</div>
                <form class="login-form" action="login">
                    <input type="text" name="username" placeholder="username" id="username"/> 
                    <input type="password" name="password" placeholder="password" id="password"/>
                    <button>login</button>
                </form>
            </div>
        </div>
        
    </body>
</html>
