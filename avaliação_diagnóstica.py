# Avaliação Diagnóstica feita por Alessandro Maciel Schmidt, aluno do 2º Período de Engenharia de Software
# Exercício 1 - Crie um programa que o usuário entre com dois números e diga qual o maior; 
'''
while True:
    try:
        print('<<<DIGITE 9999 PARA SAIR>>>')
        a = int(input('Digite o primeiro número: '))
        if a == 9999:
            break
        else: 
            b = int(input('Digite o segundo número: '))
            if b == 9999:
                break
            if a==b: 
                print(f'O primeiro e o segundo número são iguais. ({a}) e ({b}).\n')
            elif a>b: 
                print(f'O primeiro número {a} é maior que o segundo {b}.\n')
            else:
                print(f'O segundo número ({b}) é maior que o primeiro ({a}).\n')      
    except: 
        print('\n\033[31mDigite apenas números!\033[m\n')
'''
# Exercício 2 - Crie um programa que o usuário entre com o num de dias e ele converta em segundos; 

'''
try: 
    dias = int(input('Digite o números de dias para converter em segundos: '))
    segundos = dias*86400
    print(f'{dias} dias equivalem a {segundos} segundos.')
except:
    print('\n\033[31mDigite um número de dias inteiro e válido\033[m\n')
'''
# Exercício 3 - Crie um programa que o usuário entre com um num e ele diga se ele é par ou ímpar; 
while True: 
    

# Exercício 4 - Crie um programa que o usuário digite três num e ele imprima a média deles
# Exercício 5 - Crie um programa que imprima os num de 1 a 10; 
# Exercício 6 - O usuário digita um número e ele imprime o fatorial; 