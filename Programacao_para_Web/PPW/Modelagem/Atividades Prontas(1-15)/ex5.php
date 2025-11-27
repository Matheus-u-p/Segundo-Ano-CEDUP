<?php
$m= $_POST['m']; 
$n= $_POST['n'];

if($m < $n){
for($i = $m; $i<= $n; $i++){
    echo "Número $i </br>";
}
}

else if($m > $n){
for($i = $n; $i<= $m; $i++){
    echo "Número $i </br>";
}
}
?>