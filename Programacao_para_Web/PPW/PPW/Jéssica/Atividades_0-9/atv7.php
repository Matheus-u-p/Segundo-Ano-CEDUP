<?php
$carro1 = $_POST['v1'];
$anocarro1 =$_POST['v2'];
$nomecarro1 = $_POST['v3'];

$acrescimo12 = 12;
$acrescimo7 = 7;



echo "---Carango Velho:---";

if($anocarro1 > 2000){
    $conta1 = ($acrescimo7 * $carro1)/100;
    $totalcarro1 = $carro1 - $conta1;
    echo"</br> $nomecarro1 $anocarro1 com 7% de desconto: $totalcarro1";
}else if($anocarro1 <= 2000){
    $conta1 = ($acrescimo12 * $carro1)/100;
    $totalcarro1 = $carro1 - $conta1;
    echo"</br> $nomecarro1 $anocarro1 com 12% de desconto: $totalcarro1";
}
?>