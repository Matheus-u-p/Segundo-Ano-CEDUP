<?php
$combustivel = $_POST['combustivel'];
$distancia = $_POST['distancia'];

$mediaconsumo = $distancia / $combustivel;

echo "A media de consumo do automovel é: $mediaconsumo";
?>