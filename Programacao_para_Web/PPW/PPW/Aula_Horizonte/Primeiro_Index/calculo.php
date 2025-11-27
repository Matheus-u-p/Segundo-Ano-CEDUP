<?php
    $numero1= $_POST['numero1'];
    $numero2= $_POST['numero2'];
    
    $somar= $numero1 + $numero2;
    $subtrair= $numero1 - $numero2;
    $multiplicar= $numero1 * $numero2;
    if($numero1 == 0 || $numero2 ==0){
        }else{
            $dividir= $numero1 / $numero2;
        }

    echo "Resultado da soma= <input readonly value=$somar> ";
    echo "Resultado da subtração= <input readonly value=$subtrair> ";
    echo "Resultado da multiplicação= <input readonly value=$multiplicar> ";
    if($numero1 == 0 || $numero2 ==0){
        echo"Resultado da divisão= <input readonly value= Erro! Resultado =0>";
    }else{
    echo "Resultado da Divisão= <input readonly value=$dividir> ";
    }
    
?>