<?php
$valorcasa= $_POST['valorcasa'];
$salario= $_POST['salario'];
$anos= $_POST['anos'];

/*/Escreva um programa para aprovar ou não o 
empréstimo bancário para a compra de uma
casa. O programa vai perguntar o valor da casa,
o salário do comprador e em quantos anos ele
vai pagar. Calcule o valor da prestação mensal,
sabendo que ela não pode exceder 30% do
salário ou então o empréstimo será negado./*/
$conta = ($salario * $valorcasa)/100;
$contafinal= $valorcasa - $salario;
if ($contafinal >= $salario){

}else if($)

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