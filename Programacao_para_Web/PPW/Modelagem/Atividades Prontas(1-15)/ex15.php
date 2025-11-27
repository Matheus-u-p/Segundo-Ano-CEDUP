<?php
$v1 = $_POST['v1'];
$v2 = $_POST['v2'];
$v3 = $_POST['v3'];
$anterior = 0;

if($v1 >= $v2 && $v1 >= $v3){
    if($v2 > $v3){
        $anterior =0;
        for($i = $v3; $i<= $v1; $i++){
        if($i % 2 == 0) {    
        }
        else if ($i %3 ==0){
        $conta = $i + $anterior;
        $anterior = $conta;
        } 
    }
    echo "Resultado da conta: $conta </br>";

    }
    else if($v3 >= $v2){
        $anterior =0;
        for($i = $v2; $i<= $v1; $i++){
            if($i % 2 == 0) {    
            }
            else if ($i %3 ==0){
            $conta = $i + $anterior;
            $anterior = $conta;
            } 
        }   
    echo "Resultado da conta: $conta </br>";

    }
    
}

if($v2 >= $v1 && $v2 >= $v3){
    if($v1 > $v3){
        $anterior =0;
        for($i = $v3; $i<= $v2; $i++){
            if($i % 2 == 0) {    
            }
            else if ($i %3 ==0){
            $conta = $i + $anterior;
            $anterior = $conta;
            } 
        }
        echo "Resultado da conta: $conta </br>";
    }

    else if($v3 >= $v1){
        $anterior =0;
        for($i = $v1; $i<= $v2; $i++){
            if($i % 2 == 0) {    
            }
            else if ($i %3 ==0) {
            $conta = $i + $anterior;
            $anterior = $conta;
            } 
        }
        echo "Resultado da conta: $conta </br>";
        
    }
    
}

if($v3 >= $v2 && $v3 >= $v1){
    if($v2 > $v1){
    $anterior =0;
    for($i = $v1; $i <= $v3; $i++){
        if($i % 2 == 0) {    
        }
        else if ($i %3 ==0){
        $conta = $i + $anterior;
        $anterior = $conta;
        } 
    }
    echo "Resultado da conta: $conta </br>";
   
}
}
    else if($v1 >= $v2){
        $anterior =0;
        for($i = $v2; $i<= $v3; $i++){
            if($i % 2 == 0) {    
            }
            else if ($i %3 ==0){
            $conta = $i + $anterior;
            $anterior = $conta;
            } 
        }
        echo "Resultado da conta: $conta </br>";
        
    }

        
?>