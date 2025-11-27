<?php

$idade = $_POST['Idade'];

if($idade >= 5 and $idade <= 7){
    echo "Infantil A";
}
elseif($idade >= 8 and $idade <= 10){
    echo "Infantil B";
}
elseif($idade >= 11 and $idade <= 13){
    echo "Juvenil A";
}
elseif ($idade >= 14 and $idade <= 17){
    echo "Juvenil B";
}
elseif ($idade >= 18 and $idade <= 25){
    echo "Sênior";
}
else{
    echo "Idade fora da faixa etária";
}
?>