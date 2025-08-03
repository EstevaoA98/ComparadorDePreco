# Comparador de Preço - PetShop

Este projeto é uma API para comparar preços de serviços de banho em diferentes petshops.
O objetivo é fornecer uma solução eficiente para calcular os custos com base em diferentes fatores, como dia da semana, quantidade de animais e distância do petshop.

## Instruções para executar o sistema

### Pré-requisitos
- **Java 17** ou superior
- **Maven** instalado
- **Insomnia** (ou outra ferramenta de teste de API)
- **IDE** (como IntelliJ IDEA ou Eclipse)

### Passos para executar
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/estevaoandrade/ComparadorDePreco.git
   cd ComparadorDePreco
   ```

2. **Compile o projeto**:
   Execute o seguinte comando para compilar o projeto:
   ```bash
   mvn clean install
   ```

3. **Execute o projeto**:
   Inicie o servidor Spring Boot:
   ```bash
   mvn spring-boot:run
   ```

4. **Teste a API**:
   - Usei o **Insomnia** para teste de API para enviar requisições.
   - A API estará disponível em: `http://localhost:8080`.

5. **Endpoints disponíveis**:
   - **GET** `/petshops`: Lista todos os petshops cadastrados para aparecer no frontend.
   - **POST** `/calcular`: Calcula o valor total com base nos parâmetros fornecidos.

### Exemplo de requisição no Insomnia
- **Endpoint**: `POST http://localhost:8080/petshop/cotacao`
- **Body**:
   ```json
  {
  "data": "2025-08-02",
  "cachorroPequeno": 3,
  "cachorroGrande": 1
    }
   ```

---

## Lista de premissas assumidas
1. O sistema considera que todos os petshops têm preços fixos para dias da semana e finais de semana, preferir colocar os preços que tinham porcentagem ja com o valor calculado.
2. A distância do petshop é fornecida em quilômetros e é usada apenas para exibição, não para cálculos, so é usada para criterio de desempate entre os petshops mais próximos, mas dentro do codigo.
3. O foco do no meu projeto foi o **backend**, com o frontend sendo desenvolvido de forma simples utilizando recursos da web e IA.
4. O sistema foi testado usando o **Insomnia** para garantir a funcionalidade dos endpoints.

---

## Decisões de projeto
1. **Foco no backend**:
   - O backend foi priorizado para garantir uma API robusta e funcional.
   - O frontend foi simplificado usando o recurso do sprinf boot, thymeleaf, bootstrap e recursos da web, utilizando ferramentas simples para tornar a interação com o usuário mais rápida.

2. **Sem uso de Lombok**:
   - O Lombok não foi utilizado para que a lógica do código fosse mais explícita e fácil de entender.
   - No entanto, ele poderia ser aplicado para reduzir o código repetitivo, como getters, setters e construtores.

3. **Estrutura modular**:
   - O projeto foi dividido em camadas (`Model`, `Service`, `Controller`) para facilitar a manutenção e escalabilidade.

4. **Testes com Insomnia**:
   - O Insomnia foi usado para validar os endpoints e garantir que a API responde corretamente às requisições.

---
**Desafios**:

Como estou aprendendo a linguagem e também o framework que estou utilizando, o principal desafio que encontrei foi desenvolver o front-end com o uso do Thymeleaf, ferramentas com as quais eu nunca havia trabalhado antes.

Antes de começar o projeto, planejei manualmente como seria a estrutura e o funcionamento, mas durante o desenvolvimento precisei rever algumas decisões e aprofundar meus conhecimentos sobre o framework e as ferramentas que estava usando.

Decidi usar Java para este projeto justamente para aprender mais sobre a linguagem, além de utilizar o Spring Boot, que também estou a estudar a pouco tempo.

## O que mais você deve saber
- **Tecnologias utilizadas**:
  - **Spring Boot**: Framework principal para o backend.
  - **Maven**: Gerenciador de dependências e build.
  - **Insomnia**: Para testar os endpoints da API.
  - **Thymeleaf**: Template engine para o frontend.
  - **IDEA**: intellij.

  

- **GitHub**: [https://github.com/EstevaoA98]
- **Repositório**: (https://github.com/EstevaoA98/ComparadorDePreco)
