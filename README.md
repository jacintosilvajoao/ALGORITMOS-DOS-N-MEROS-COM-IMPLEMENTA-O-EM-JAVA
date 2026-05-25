Algoritmos dos Números: fundamentos matemáticos, implementação em Java e aplicações em criptografia assimétrica.
-Curso: Licenciatura em Engenharia Informática
-Docente Responsável: Joaquim João Nsaku Ventura

Este projeto é um trabalho prático da disciplina de Algoritmos e Estruturas de Dados II, cujo objetivo é estabelecer a ligação entre a teoria e a prática, demonstrando como conceitos da Matemática Discreta e da Aritmética Modular são aplicados no contexto real da Segurança Informática.

INTEGRANTES DO GRUPO:
            1 - Augusto Mbota João Gomes
            2 - Jacinto Silva João
            3 - José André Gabriel
            4 - Kassako Madia
            5 - Maria Pedro Barro

Funcionalidades Principais 
Cálculo de Máximo Divisor Comum (MDC): Implementação via método iterativo direto/simples e via método otimizado pelo Algoritmo de Euclides.
Análise de Primalidade e Factorização: Módulos dedicados a testar se um inteiro é primo e a realizar a decomposição de números compostos em fatores primos.
Aritmética Modular Avançada: Operações de congruência, aplicação estruturada do Pequeno Teorema de Fermat e resolução de sistemas lineares através do Teorema Chinês do Resto.
Função Totiente de Euler: Computação exata de $\Phi(n)$ para determinar a densidade de coprimos, servindo de base de suporte ao subsistema criptográfico.
Criptosistema RSA Didático: Geração de chaves públicas e privadas a partir de primos selecionados, com fluxos operacionais completos de cifragem e decifragem de mensagens textuais/numéricas.

Tecnologias Utilizadas 
Linguagem:** Java (Ambiente de Execução Nativo, sem dependência de frameworks ou bibliotecas de terceiros para o núcleo algorítmico).
Versão Mínima Recomendada:** JDK 17 (ou superior). 
IDE Recomendada: IntelliJ IDEA / Eclipse / VS Code.
Sistema de Controlo de Versões: Git & GitHub.


Estrutura do Projeto
O código-fonte segue rigidamente a organização modular por pacotes proposta no plano académico de orientação do projeto:

algoritmos-dos-numeros-java/
├── README.md                  # Instruções e documentação do repositório
├── src/
│   ├── Main.java              # Ponto de entrada do programa e menu de navegação
│   ├── mdc/
│   │   └── MaximoDivisorComum.java  # Cálculo do MDC por método direto/simples
│   ├── euclides/
│   │   └── AlgoritmoEuclides.java   # Cálculo otimizado do MDC via Euclides
│   ├── primos/
│   │   ├── TestePrimalidade.java    # Verificação de números primos
│   │   └── FactorizacaoInteiros.java # Decomposição de inteiros em fatores primos
│   ├── modular/
│   │   ├── Congruencia.java         # Operações de aritmética modular
│   │   ├── Fermat.java              # Pequeno Teorema de Fermat
│   │   └── TeoremaChinesResto.java  # Resolução de sistemas de congruências
│   ├── euler/
│   │   └── TotienteEuler.java       # Implementação da função Totiente Phi(n)
│   └── rsa/
│       └── RSA.java                 # Instanciação didática do pipeline RSA
└── docs/
    ├── entradas-saidas.txt    # Registro de casos de teste para validação
    └── descricao-do-projecto.md # Descrição técnica auxiliar


Como Compilar e Executar o Projeto
📌 Requisitos Mínimos

Antes de executar o projeto, é necessário garantir que o ambiente de desenvolvimento está corretamente configurado com as seguintes ferramentas:

Git
Necessário para clonar o repositório e gerir o controlo de versões do código.
Java Development Kit (JDK)
Versão 21 ou superior, obrigatória para garantir compatibilidade com as funcionalidades utilizadas no projeto.
IDE (Ambiente de Desenvolvimento Integrado)
Recomenda-se o uso de uma das seguintes ferramentas:
IntelliJ IDEA
NetBeans
Eclipse 

Link para clonar o repositorio:
````bash
git clone https://github.com/jacintosilvajoao/ALGORITMOS-DOS-N-MEROS-COM-IMPLEMENTA-O-EM-JAVA.git
````