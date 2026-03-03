<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") { //recibe datos

    $n = intval($_POST["cantidad"]);
    $horas = explode("\n", trim($_POST["horas"]));

    for ($i = 0; $i < $n; $i++) {

        if (!isset($horas[$i])) break;

        [$hh, $mm] = explode(':', trim($horas[$i]));

        $minutosReales = 1440 - ($hh * 60 + $mm);

        $horaReal   = intdiv($minutosReales, 60);
        $minutoReal = $minutosReales % 60;

        $horaReal = ($horaReal === 1440) ? 12 : $horaReal;

        printf("<p><strong>Hora reflejada:</strong> %s → 
                <strong>Hora real:</strong> %02d:%02d</p>", 
                $horas[$i], $horaReal, $minutoReal);
    }

    echo "<a href='practica_reloj.html' class='boton'>Volver</a>
    </div>
    </body>
    </html>";
}
?>