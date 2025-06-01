# T2_Algoritmos

Grupo:
Douglas Portatil da Silva - RA:23.01206-4
Victor Pazo Molina da Silva - RA:22.00429-7

Atividade T2 da matéria de Algoritmos e Estrutura de dados dirigido pela professora Andreia Machion. Segue o escopo da atividade:

Impressora com Fila de Impressão (Simulação com Fila - FIFO) Você foi contratado para desenvolver um sistema de gerenciamento de impressões em uma gráfica rápida. Os documentos são colocados em uma fila, sendo impressos na ordem de chegada (primeiro a entrar, primeiro a ser impresso — FIFO).
Requisitos do Sistema: Entrada de Documentos:

Um documento entra na fila de impressão (é adicionado ao final da fila).

O sistema registra o nome do arquivo, o nome do usuário e o horário de solicitação (uma classe deve conter essas informações).

Impressão de Documento:

O primeiro documento da fila é impresso (removido da frente).

O sistema deve registrar o horário de impressão e calcular o tempo total de espera.

Consulta de Documento:

O sistema deve permitir consultar se um determinado documento está na fila, sua posição e o horário de solicitação.

Capacidade da Fila:

A fila de impressão tem uma capacidade máxima definida. O sistema deve impedir novos envios quando a capacidade máxima for atingida.

Objetivo:

Desenvolver um programa que implemente essa lógica utilizando uma estrutura de dados de fila. O programa deve simular a entrada e saída de documentos e fornecer relatórios sobre a ocupação atual da fila e o tempo de espera de cada documento impresso.

Pilha de Reimpressão Emergencial (Simulação com Pilha - LIFO) Além da fila principal, a gráfica mantém uma pilha para casos de reimpressão emergencial, em que documentos precisam ser reimpressos rapidamente por falhas de impressão ou outros problemas. Os documentos mais recentes têm prioridade (último a entrar, primeiro a ser reimpresso — LIFO).
Requisitos do Sistema: Solicitação de Reimpressão:

Um documento é adicionado ao topo da pilha de reimpressão.

O sistema deve registra o nome do arquivo, o nome do usuário e o horário da solicitação.

Execução de Reimpressão:

O documento que está no topo da pilha é reimpresso (removido do topo).

O sistema deve registrar o horário da reimpressão e calcular o tempo total decorrido desde a solicitação.

Consulta de Documento:

O sistema deve permitir verificar se um documento está na pilha de reimpressão, sua posição (a partir do topo) e o horário de solicitação.

Capacidade da Pilha:

A pilha tem uma capacidade máxima definida. O sistema deve impedir novas solicitações de reimpressão quando a capacidade for atingida.

Objetivo:

Desenvolver um programa que implemente essa lógica utilizando uma estrutura de dados de pilha. O programa deve simular as operações de reimpressão e fornecer relatórios sobre os documentos armazenados e o tempo de atendimento.
