<?php

$largura= $_POST['largura']; 
$comprimento= $_POST['comprimento'];

$area = $largura * $comprimento;

if($area < 100){
    echo "O terreno de $area m² é classificado em TERRENO POPULAR!";
}

elseif($area >=100 && $area <=500){
    echo "O terreno de $area m² é classificado em TERRENO MASTER!";
}

elseif($area >500){
    echo "O terreno de $area m² é classificado em TERRENO VIP!";
}

?>