<?php
$anterior =0;
for($i = 3; $i< 500; $i+=3){
    if($i % 2 == 0) {    
    }
    else {
        $conta = $i + $anterior;
        $anterior = $conta;
    } 
}
echo "Resultado da conta: $conta </br>";

?>

 