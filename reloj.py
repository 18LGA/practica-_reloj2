n = int(input("ingrese cuantas horas desea ingresar:"))
for _ in range(n):
    hh, mm = map(int, input("ingrese su hora: ").split(':'))
    total_reflejo = hh * 60 + mm
    total_real = 1440 - total_reflejo
    if total_real == 1440:
        print("12:00")
    else:
        h_real = total_real // 60
        m_real = total_real % 60
        print(f"la  hora es : {h_real:02d}:{m_real:02d}")