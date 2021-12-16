try {
  //  código que inclui comandos/invocações de métodos
  //  que podem gerar uma situação de exceção.
}
catch (XException exception) {
  //  bloco de tratamento associado à condição de
  //  exceção XException ou a qualquer uma de suas
  //  subclasses, identificada aqui pelo objeto
  //  com referência x
}
catch (YException exception) {
  //  bloco de tratamento para a situação de exceção
  //  YException ou a qualquer uma de suas subclasses
}
finally {
	//  bloco de código que sempre será executado após
  //  o bloco try, independentemente de sua conclusão
  //  ter ocorrido normalmente ou ter sido interrompida
}

