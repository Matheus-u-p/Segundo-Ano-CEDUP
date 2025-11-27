<?php
$n1 = $_POST['n1'];
$n2 = $_POST['n2'];

if($n1 < $n2){
    for($i = $n1; $i <= $n2; $i++){
        if($i % 2 == 0) { 
            echo "$i é um número Par";
            echo"</br>";
        }
        else {
            echo "$i é um número Impar";
            echo"</br>";
        } 
        
        if($i % 3 == 0){
            echo "$i é um número multiplo de 3";
            echo"</br>";
        }
        else{
            echo "$i não é um número multiplo de 3";
            echo"</br>";
        }
    }
}

if($n2 < $n1){
    for($i = $n2; $i <= $n1; $i++){
        if($i % 2 == 0) { 
            echo "$i é um número Par";
            echo"</br>";
        }
        else {
            echo "$i é um número Impar";
            echo"</br>";
        }
        
        if($i % 3 == 0){
            echo "$i é um número multiplo de 3";
            echo"</br>";
        }
        else{
            echo "$i não é um número multiplo de 3";
            echo"</br>";
        }

    }
}



?>
