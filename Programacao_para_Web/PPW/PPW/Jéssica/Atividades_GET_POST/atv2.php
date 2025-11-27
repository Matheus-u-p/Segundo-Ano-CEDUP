<?php
$nome= $_POST['nome'];
$salario= $_POST['salario'];
$anos= $_POST['anos'];

if($anos < 3){
    $reajuste= ($salario*3)/100;
    $reajuste2= $reajuste + $salario;
    echo "</br> Seu novo salario com 3% de aumento é de: $reajuste2";
}
else if($anos > 3 && $anos < 10){
    $reajuste= ($salario*12.5)/100;
    $reajuste2= $reajuste + $salario;
    echo "</br> Seu novo salario com 12.5% de aumento é de: $reajuste2";
}
else{
    $reajuste= ($salario*20 )/100;
    $reajuste2= $reajuste + $salario;
    echo "</br> Seu novo salario com 20% de aumento é de: $reajuste2";
}
?>