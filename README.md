# Exercício 01
Elabore uma classe ContaBancaria, com os seguintes membros:
<br>• atributo String cliente
<br>• atributo int num_conta
<br>• atributo float saldo
<br>• método sacar (o saldo não pode ficar negativo)
<br>• método depositar
<br><br>Agora acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupança e
ContaEspecial, com as seguintes características a mais:
<br><br>• Classe ContaPoupança:
<br>o atributo int dia de rendimento
<br>o método calcularNovoSaldo, recebe a taxa de rendimento da poupança e
atualiza o saldo.
<br><br>• Classe ContaEspecial
<br>o atributo float limite
<br>o redefinição do método sacar, permitindo saldo negativo até o valor do limite.
<br><br>Após a implementação das classes acima, você deverá implementar uma classe Contas.Java,
contendo o método main. Nesta classe, você deverá implementar:
<br><br>• Incluir dados relativos a(s) conta(s) de um cliente de Conta Poupança e Conta
Especial;
<br>• Sacar um determinado valor da(s) sua(s) conta(s);
<br>• Sacar um valor superior ao saldo;
<br>• Sacar um valor dentro do limite da conta especial e acima do limite;
<br>• Depositar um determinado valor na(s) sua(s) conta(s);
<br>• Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que
possuem conta poupança;
<br>• Mostrar os dados da(s) conta(s) de um cliente;
