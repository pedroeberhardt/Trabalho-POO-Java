# ☕ Trabalho Prático de Programação Orientada a Objetos (POO) - Java

Este repositório contém a implementação do projeto prático de Programação Orientada a Objetos (POO) desenvolvido em Java. O sistema consiste em uma aplicação de terminal interativa com menu que gerencia, recalcula e exibe dados e regras de negócio para três entidades diferentes: **Sapato**, **Paciente** e **Celular**.

---

## 📌 Funcionalidades Principais

* **Menu Interativo Dinâmico:** Navegação entre as entidades via menu de opções utilizando a estrutura `switch-case` e laços de repetição `while`.
* **Atualização em Tempo Real:** Ao alterar qualquer atributo de um objeto (como a idade de um paciente), o sistema reexecuta a lógica de negócios e exibe os relatórios atualizados.
* **Interface Limpa:** Uso de rotinas para limpeza de tela no terminal e formatação adequada das saídas com acentuação correta.
* **Tratamento de Entrada:** Limpeza de buffer de entrada (`Scanner.nextLine()`) para prevenir erros de leitura nos tipos primitivos e textos.

---

## 📁 Estrutura do Projeto

O projeto é dividido em 4 classes principais localizadas no mesmo diretório:

| Arquivo | Descrição |
| :--- | :--- |
| `Principal.java` | Classe principal com o método `main`, gerenciamento do menu de opções, leitura do usuário e chamada dos relatórios. |
| `Sapato.java` | Classe que modela um sapato (marca, tamanho), além de métodos para cálculo de desconto e verificação de disponibilidade. |
| `Paciente.java` | Classe que representa um paciente (nome, idade, peso), incluindo cálculo de IMC, faixa etária e necessidade de acompanhante. |
| `Celular.java` | Classe que representa um smartphone (modelo, preço, sistema), com cálculo de lote, categorização e estimativa de revenda. |

---

## ⚙️ Regras de Negócio e Métodos Implementados

### 👟 Classe Sapato
* **`calcularPrecoComDesconto(preco, percentual)`**: Aplica uma porcentagem de desconto sobre o valor inicial.
* **`verificarDisponibilidade()`**: Aplica a validação de disponibilidade no estoque/grade com base nos dados cadastrados.

### 🏥 Classe Paciente
* **`calcularIMC(altura)`**: Retorna o Índice de Massa Corporal com base no peso e na altura informada.
* **`verificarFaixaEtaria()`**: Classifica o paciente conforme a faixa etária.
* **`verificarNecessidadeAcompanhante()`**: Determina se o paciente necessita obrigatoriamente de acompanhante (Idade < 12 anos ou Idade > 60 anos).

### 📱 Classe Celular
* **`calcularTotalLote(quantidade)`**: Calcula o valor total para compras em lote.
* **`verificarCategoria()`**: Categoriza o dispositivo com base na faixa de preço.
* **`calcularValorDeRevenda(anosUso)`**: Modela a depreciação do aparelho ao longo do tempo.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java Development Kit (JDK) 8 ou superior instalado.
* Um terminal/prompt de comando ou uma IDE de sua preferência (VS Code, Eclipse, IntelliJ).

### Passo a Passo

1. **Clonar ou baixar o repositório:**
   ```bash
   git clone [https://github.com/pedroeberhardt/Trabalho-POO-Java.git](https://github.com/pedroeberhardt/Trabalho-POO-Java.git)
   cd Trabalho-POO-Java
