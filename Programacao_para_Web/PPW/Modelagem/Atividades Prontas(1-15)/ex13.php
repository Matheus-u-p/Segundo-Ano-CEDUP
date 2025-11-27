<?php
$razao = $_POST['razao'];
$A = $_POST['A'];
$anterior= 0;

for($i =0; $i <= 10; $i++){
    if($i == 0){
        $conta = $razao + $A;
        $anterior = $conta;
        echo "$anterior </br>";
    }
    $conta = $razao + $anterior;
    $anterior = $conta;
    echo "$anterior </br>";
}

?>