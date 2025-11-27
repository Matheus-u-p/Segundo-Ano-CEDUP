<?php

$horaula = $_POST['horaula'];
$nivel = $_POST['nivel'];

if($nivel == 1){
    $conta = $horaula *12;

}
if($nivel == 2){
    $conta = $horaula *17;
}

if($nivel == 3){
    $conta = $horaula *25;
}

echo "O professor de nível $nivel vai receber: R$$conta";
?>