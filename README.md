# NullObject
Project about studies of Design Patterns

Nesse projeto abordamos um padrão não muito conhecido, mas que poderá lhe ajudar em futuros projetos que tratam de situações
em que uma determinada classe poderá assimir valores Nulos. Digamos que tenhamos uma classe 'User', com os seguintes 
atributos:

- code
- name
- age
- height

Dentre esses atributos,dois podem ser nulos, que são:

- age
- height

Então para evitar a situação de :

          User user = UserFactory.createUser(null);;
          if(user != null) {
            request.setAge( user.geAge());
            request.setHeight(user.getHeight());
          } else {
            request.setAge(0);
            request.setHeight(0);
          }
