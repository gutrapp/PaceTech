while True:
    command = input("""Oque voce gostaria de fazer no programa:
    1 - Converter Temperaturas
    2 - Converter Dinheiro
    3 - Sair

    >>> """)
    if command == "1":
        while True:
            subcommand = input("""Voce gostaria de:
            1 - Converter Fahrenheit para Celsius 
            2 - Converter Celsius para Fahrenheit
            3 - Voltar ao menu

            >>> """)
            if subcommand == "1":
                value = input("Qual sua temperatura? ")
                print(f'Sua temperatura e de {(int(value) - 32) * (5 / 9)}°C')
            elif subcommand == "2":
                value = input("Qual sua temperatura? ")
                print(f'Sua temperatura e de {(int(value) * (9 / 5) + 32)}°F')
            else:
                break
    elif command == "2":
        while True:
            subcommand = input("""Voce gostaria de:
            1 - Converter Dolar para Real 
            2 - Converter Real para Dolar
            3 - Voltar ao menu

            >>> """)
            if subcommand == "1":
                value = input("Quanto de dinheiro voce tem: ")
                print(f'Seu dinheiro e de {int(value) * 5.2}R$')
            elif subcommand == "2":
                value = input("Quanto de dinheiro voce tem: ")
                print(f'Seu dinheiro e de {int(value) / 5.2}U$')
            else:
                break
    else:
        break








