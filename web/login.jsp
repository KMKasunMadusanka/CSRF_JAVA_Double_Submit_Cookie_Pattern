
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Style Sheet-->
        <link rel="stylesheet" href="./resources/login.css"/>
        
        <!--Bootstrap-->
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body id="LoginForm">
        <div class="container">
            <h1 class="form-heading">SLIIT Feedback Collection Page</h1>
            <h5 class="form-heading_h5">Secured with double submit cookie pattern</h5>
            <div class="login-form">
                <div class="main-div">
                    <div class="panel">
                        <h2>System Login</h2>
                        <p>Please enter user name and password</p>
                    </div>
                    <form id="Login" action="login" method="post">

                        <div class="form-group">


                            <input type="text" name="username" class="form-control" id="username" placeholder="User Name">

                        </div>

                        <div class="form-group">

                            <input type="password" name="password" class="form-control" id="password" placeholder="Password">

                        </div>
                        <div class="forgot">

                        </div>
                        <button type="submit" class="btn btn-primary">Login</button>

                    </form>
                </div>

            </div></div></div>


</body>


</html>
