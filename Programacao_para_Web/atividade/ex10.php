<?php 
$n1= $_POST['n1'];
$opera= $_POST['opera'];
$n2= $_POST['n2'];

if($opera == "+"){
    $soma= $n1+$n2;
    echo "O resultado da soma é: $soma";
}

else if($opera == "-"){
    $subtracao= $n1-$n2;
    echo "O resultado da subtração é: $subtracao";
}

else if($opera == "*"){
    $multiplicacao= $n1*$n2;
    echo "O resultado da multiplicação é: $multiplicacao";
}

else if($opera == "/"){
    $divisao= $n1/$n2;
    echo "O resultado da divisão é: $divisao";
}

?>