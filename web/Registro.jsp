
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
        <%! /* <link rel="stylesheet" type="text/css" href="css/screen.css"> */%>
        <link rel="stylesheet" href="css/screen.css">
        <script type="text/javascript" src="js/jquery-1.11.1.js"></script>
        <script type="text/javascript" src="js/jquery.validate.min.js"></script>
        <script type="text/javascript" src="js/main.js"></script>
        
    </head>
    <body>
        <h1>Nuevo Usuario</h1>
        
        <form method="POST" id="frm-registro">
            <table>
                <tr>
                    <td><label for="username">Email</label></td>
                    <td><input type="text" name="username" id="username"></td>                    
                </tr>
                <tr>
                    <td><label for="password">Password</label></td>
                    <td><input type="password" name="password" id="password"></td>                    
                </tr>
                <tr>
                    <td><label for="password2">Verificar Password</label></td>
                    <td><input type="password" name="password2" id="password2"></td>                    
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Registrarme" id="btn-registro"></td>                    
                </tr>
                
                
            </table>
        </form>
    </body>
</html>
