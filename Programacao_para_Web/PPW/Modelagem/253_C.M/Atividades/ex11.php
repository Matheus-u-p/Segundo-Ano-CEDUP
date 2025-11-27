<?php
$anterior =0;
for($i = 0; $i< 500; $i++){
    if($i % 2 == 0) {    
    }
    else {
        $conta = $i + $anterior;
        $anterior = $conta;
    } 
}
echo "Resultado da conta: $conta </br>";

?>