<?php
$largura= $_POST['largura'];
$comprimento= $_POST['comprimento'];

$area= $largura*$comprimento;

echo "A área do terreno é: $area m²";

if($area < 100){
    echo "</br> O terreno é um terreno popular";
}
else if($area >=100 && $area <=500){
    echo "</br> O terreno é um terreno master";
}
else{
    echo "</br> O terreno é um terreno vip";
}
?>