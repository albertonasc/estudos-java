package com.demo.tratamentoexcecoes;

public class Main {

    public static void main(String[] args) {

        System.out.println("Cliente faz o pedido");
        System.out.println("Garçom envia para a cozinha");
        try {
            System.out.println("Chefe tenta preparar o pedido");

            if(false) {
                throw new IngredienteIndisponivelException();
            }

            if(false) {
                throw new EntregaPedidoException("Grçom tropeçou");
            }

            throw new RuntimeException("Erro generico");

        } catch (IngredienteIndisponivelException e) {
            System.out.println("Chefe indica um novo pedido para o cliente");
            System.out.println("Cliente aceita o novo pedido");

            throw new NullPointerException();

        } catch (EntregaPedidoException e) {
            System.out.println("Garçom pede desculpas");
            System.out.println("Chefe prepara novo pedido");

        } catch (Exception e) {
            System.out.println("Erro aconteceu durante o preparo do pedido");

        }
        finally {
            System.out.println("Cliente paga a conta");
        }

    }
}
