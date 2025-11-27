<?php

$kw = $_POST['kw'];
$cod = $_POST['cod'];

if($cod == 1){
    $conta = $kw *0.60;

}
if($cod == 2){
    $conta = $kw *0.48;
}

if($cod == 3){
    $conta = $kw *1.29;
}

echo "O valor gasto foi de R$$conta";
?>