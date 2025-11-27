<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <form action='ex9.php' method='post'>
            <input type="text" name="n1" placeholder="Digite o número">
            <input type="submit" value="Enviar" name='bt'>
        </form>
    </body>
</html>

<?php 
    if(isset($_POST['bt'])){
    $n1= $_POST['n1'];

        if($n1 % 2 == 0) { 
            echo "$n1 é um número Par";
        }

        else {
            echo "$n1 é um número Impar";
        }  
    }
?>