Pn = list()
Nn = list()
Xm = list()
NXm = list()
XmSqr = list()
NXmSqr = list()


def epic(numbers):
    equal_sign = False
    while len(numbers) > 0:
        if numbers[0] == "=":
            equal_sign = True                   # Funciona indo de index por index removendo coda informacao no index
            numbers.pop(0)                      # Se quiser ver como funciona tire os print que estao comentados
        temp_numbers = list()
        if numbers[0] == "-":
            # print(numbers)
            numbers.pop(0)
            if not numbers[0] == "x" or not numbers[0] == "-" or not numbers[0] == "+":
                k = True
                while k:
                    temp_numbers.append(numbers[0])
                    numbers.pop(0)
                    if numbers == []:
                        if equal_sign:
                            Pn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                        elif not equal_sign:
                            Nn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                    elif numbers[0] == "-" or numbers[0] == "+" or numbers[0] == "=":
                        if equal_sign:
                            Pn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                        elif not equal_sign:
                            Nn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                    elif numbers[0] == 'x':
                        numbers.pop(0)
                        if numbers == []:
                            if equal_sign:
                                Xm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                            elif not equal_sign:
                                NXm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                        elif numbers[0] == "S":
                            numbers.pop(0)
                            if equal_sign:
                                XmSqr.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                            elif not equal_sign:
                                NXmSqr.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                        else:
                            if equal_sign:
                                Xm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                            elif not equal_sign:
                                NXm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
        elif numbers[0] == "+":
            # print(numbers)
            numbers.pop(0)
            if not numbers[0] == "x" or not numbers[0] == "-" or not numbers[0] == "+":
                k = True
                while k:
                    temp_numbers.append(numbers[0])
                    numbers.pop(0)
                    if numbers == []:
                        if equal_sign:
                            Nn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                        elif not equal_sign:
                            Pn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                    elif numbers[0] == "-" or numbers[0] == "+" or numbers[0] == "=":
                        if equal_sign:
                            Nn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                        elif not equal_sign:
                            Pn.append(''.join(temp_numbers))
                            temp_numbers.clear()
                            k = False
                    elif numbers[0] == 'x':
                        numbers.pop(0)
                        if numbers == []:
                            if equal_sign:
                                NXm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                            elif not equal_sign:
                                Xm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                        elif numbers[0] == "S":
                            numbers.pop(0)
                            if equal_sign:
                                NXmSqr.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                            elif not equal_sign:
                                XmSqr.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                        else:
                            if equal_sign:
                                NXm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
                            elif not equal_sign:
                                Xm.append(''.join(temp_numbers))
                                temp_numbers.clear()
                                k = False
    return "Done"


def bhaskara(p, n, x, nx, xs, nxs):
    result = 0
    sign = ""
    sums = 0
    x_sum = 0                                            # Solver das equacoes de 2 grau
    xs_sum = 0
    n_sum = False
    nx_sum = False
    nxs_sum = False
    if p == 0 or n == 0:
        if n > 0:
            sums = p + n
            n_sum = True
        else:
            sums = p + n
    elif p == n:
        return "This equation isn't possible"
    elif p > n:
        sums = p - n
    elif n > p:
        sums = n - p
        n_sum = True

    if x == 0 or nx == 0:
        if nx > 0:
            x_sum = x + nx
            nx_sum = True
        else:
            x_sum = x + nx
    elif x == nx:
        return "This equation isn't possible"
    elif x > nx:
        x_sum = x - nx
    elif nx > x:
        x_sum = nx - x
        nx_sum = True

    if xs == 0 or nxs == 0:
        if nxs > 0:
            xs_sum = xs + nxs
            nxs_sum = True
        else:
            xs_sum = xs + nxs
    elif xs == nxs:
        return solver(p, n, x, nx)                                 # Se o xS e zero vira uma equacao do 1 grau
    elif xs > nxs:
        xs_sum = xs - nxs
    elif nxs > xs:
        xs_sum = nxs - xs
        nxs_sum = True

    a = xs_sum
    b = x_sum
    c = sums
    delta = 0
    x1 = 0
    x2 = 0

    if n_sum and nxs_sum:
        delta = b**2 - 4*a*c
    elif n_sum or nxs_sum:
        delta = b**2 + 4*a*c
    elif not n_sum and not nxs_sum:
        delta = b**2 - 4*a*c

    if delta < 0:
        return "Negative root"                              # Se delta < 0 e impossivel de resolver se mantendo na reali
    else:                                                   # dade geometrica
        delta = delta ** (1/2)

    if nx_sum:
        x1 = (b + delta) / (2 * a)
        x2 = (b - delta) / (2 * a)
    elif not nx_sum:                                        # Nao e necessaria formatacao de sinal pois ja foi feita
        x1 = (b - delta) / (2 * a)
        x2 = (b + delta) / (2 * a)

    return f'x1 = {x1}, x2 = {x2}'


def solver(p, n, x, nx, xs=0, nxs=0):
    result = 0                                              # Aqui e onde a magica acontece, e o que realmente vai
    sign = ""                                               # Resolver o input do usuario
    if int(xs) > 0 or int(nxs) > 0:
        sign = bhaskara(p, n, x, nx, xs, nxs)               # Se o programa identificar que e uma equacao de 2 grau
        return sign                                         # vai chamar uma funcao diferente
    else:
        sums = 0
        x_sum = 0
        n_sum = False
        nx_sum = False
        if p == 0 or n == 0:
            if n > 0:
                sums = p + n
                n_sum = True
            else:
                sums = p + n
        elif p == n:
            return "This equation isn't possible"             # So resolvendo um problema pq nao tem como dizer o valor
        elif p > n:                                           # de x se os numeros dao igual a zero
            sums = p - n
        elif n > p:
            sums = n - p
            n_sum = True

        if x == 0 or nx == 0:
            if nx > 0:
                x_sum = x + nx
                nx_sum = True
            else:
                x_sum = x + nx
        elif x == nx:
            return "This equation isn't possible"             # So resolvendo um problema pq nao tem como dizer o valor
        elif x > nx:                                          # de x se o x nao existe
            x_sum = x - nx
        elif nx > x:
            x_sum = nx - x
            nx_sum = True
        print(f'{sums}, {x_sum}')
        print(n_sum)
        print(nx_sum)
        if nx_sum and n_sum:
            result = sums / x_sum
            sign = "-"
        elif not n_sum and not nx_sum:
            result = sums / x_sum                             # Ultima formatacao necessaria so para imprimir bonito
            sign = "-"                                        # Pois nao utilizei numeros com sinal negativo
        elif nx_sum or n_sum:
            result = sums / x_sum
            sign = "+"
        return f'x = {sign}{result}'


def separator(s):
    result = list()
    for x in s[:]:
        if x == " ":                                          # Formatar input para fazer o programa entender
            continue                                          # Se quiser ver como e formatado tirar print do comentario
        else:
            result.append(x)
    # print(result)
    return result


def list_solver(a):
    result = 0
    if len(a) == 0:
        return result
    else:
        for i in a:                                             # Vai somar os conteudos das listas
            i = int(i)                                          # por exemplo Nn = (2, 4, 6) = 12 = Nn
            if len(a) == 1:
                result = i
            else:
                result += i
        return result


number = epic(separator(input()))       # Formatador do input do usuario

Pn = int(list_solver(Pn))
Nn = int(list_solver(Nn))
Xm = int(list_solver(Xm))
NXm = int(list_solver(NXm))
XmSqr = int(list_solver(XmSqr))
NXmSqr = int(list_solver(NXmSqr))

print(f'p {Pn}')
print(f'n {Nn}')
print(f'x {Xm}')
print(f'-x {NXm}')
print(f'x2 {XmSqr}')
print(f'-x2 {NXmSqr}')

print(solver(Pn, Nn, Xm, NXm, XmSqr, NXmSqr))               # print que vai imprimir o resultado













