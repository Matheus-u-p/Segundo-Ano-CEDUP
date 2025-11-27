<?php

$nome = $_POST['nome']; 
$salario = $_POST['salario'];
$anos = $_POST['anos'];

if($anos<3){
    $salario1 = ($salario/100)*3;
    $salariof = $salario+$salario1;
    echo "O salário do funcionário $nome, com o aumento é de $salariof";
}

elseif($anos>=3 && $anos<=10){
    $salario1 = ($salario/100)*12.5;
    $salariof = $salario+$salario1;
    echo "O salário do funcionário $nome, com o aumento é de $salariof";
}

elseif($anos>10){
    $salario1 = ($salario/100)*20;
    $salariof = $salario+$salario1;
    echo "O salário do funcionário $nome, com o aumento é de $salariof";
}

?>