# Sistema de Gestão de Funcionários

Este projeto em Java é um sistema de gestão de funcionários, com funcionalidades para cadastrar, listar e aplicar aumento salarial. O sistema permite o cadastro de funcionários assalariados e horistas, com cálculos de salários e armazenamento de dados essenciais como nome, CPF, endereço, telefone e setor.

## Funcionalidades

- Cadastro de **funcionários assalariados** e **horistas**.
- Armazenamento das informações essenciais dos funcionários: nome, CPF, endereço, telefone e setor.
- Cálculo do **salário mensal** para assalariados e **pagamento por horas trabalhadas** para horistas.
- Aplicação de aumento salarial para todos os funcionários cadastrados.

## Como rodar o projeto

### Pré-requisitos

- [JDK 17 ou superior](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
- [Maven](https://maven.apache.org/) instalado (opcional, mas recomendado para compilar e gerenciar dependências).

### Passos

1. Clone este repositório:

   ```bash
   git clone https://github.com/username/RH_Funcionarios.git

2. Navegue até o diretório do projeto:
   cd RH_Funcionarios

3. Compile e execute o projeto:

Se você estiver utilizando o Maven, rode o seguinte comando para compilar e rodar o aplicativo:

mvn clean install exec:java

4. O programa solicitará informações para cadastrar funcionários e aplicar aumentos salariais.

Estrutura do Projeto
src/main/java/com/mycompany/rh_funcionarios/: Contém a implementação principal do sistema.

Funcionario.java: Classe base que define a estrutura comum entre os tipos de funcionários.

Assalariado.java: Subclasse de Funcionario para representar funcionários com salário fixo.

Horista.java: Subclasse de Funcionario para representar funcionários pagos por hora.

RH_Funcionarios.java: Classe principal, onde ocorre a interação com o usuário para cadastro e processamento.

Contribuições
Sinta-se à vontade para abrir issues ou pull requests para melhorias ou correções.

Licença
Este projeto é de código aberto e licenciado sob a MIT License.


### Passos para adicionar o `README.md` no seu repositório:

1. Crie um arquivo chamado `README.md` na raiz do seu projeto.
2. Cole o conteúdo acima no arquivo.
3. Faça o commit e envie para o repositório:

   ```bash
   git add README.md
   git commit -m "Adiciona README.md"
   git push origin master
