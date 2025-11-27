<?php

$notas = [$_POST['n1'], $_post['n2'], $_post['n3']];

$maior = max($notas);
$media = array_sum($notas) / count($notas);

echo "A maior nota é $maior <br>";
echo "A média é $media";