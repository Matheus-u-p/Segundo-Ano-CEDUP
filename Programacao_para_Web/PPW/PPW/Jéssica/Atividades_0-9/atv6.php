<?php
$custodefrabrica = $_POST['fabrica'];
$distribuidor = $_POST['distribuidor'];
$imposto = $_POST['imposto'];

$porcentagemimpost = ($imposto *$custodefrabrica)/100;
$conta1= $custodefrabrica + $porcentagemimpost;
$porcentagemdist = ($distribuidor * $conta1)/100;
$conta2 = $conta1 + $porcentagemdist;

echo"O preço do carro é de: $conta2";

?>