# Zadanie 1 - Functions.save(Object object, String filepath)
Funkcja save() w klasie Functions jest odpowiedzialna za serializowanie obiektu i zapisywanie go \
w odpowiednim pliku (wskazanym przez zmienną 'filePath'). Uzupełnij metodę aby: 
- Można było jej użyć bez inicjalizacji obiektu (Functions.save(...))
- Uzupełnij brakujący kod, aby możliwa była serializacja obiektu i zapisanie go
- Uruchom klasę Demo, aby przetestować czy dobrze zaimplementowałeś fukcje save(). Jeżeli ci się udało to wyświetli się zawartość wczytanego obiektu.
# Zadanie 2 - Prosta komunikacja z serwerem
Sposób testowania: uruchom klase Server, a następnie Client
- Napraw połączenie między Serwerem, a klientem (Powinna zadziałać część demonstracyjna).
- Program prześle na serwer obiekt typu Messsage o nazwie 'message', a następnie zserializuje go do pliku o nazwie 'message.filename'.
- Klient wyśle żądanie na serwer w celu wczytania zapisanego pliku i odesłania na klienta. Dopisz brakujący kod. 
- Jeśli klient poprawnie odbierze wiadomość, wyświetli się następujący tekst w konsoli:
```
Cmd: Zapisz
Filename: wiadomosc
SUCCESS ! 
```
# Zadanie 3 - Przesyłanie plików
Sposób testowania: uruchom klase Server, a następnie Client\
Klient wysyła na serwer plik "image.png", a następnie żądanie w celu pobrania go. 
- Uzupełnij kod w klasie ServerThread:
  - Zapisz plik i metadane na serwerze.
  - Odebrany obiekt 'fileContainer' zamień na metadane.
  - Program prześle metedane do klienta.
- Dopisz brakujący kod w klasie ClientThread:
  - Ustaw folder docelowy odebranego pliku na zmienną 'clientDir'.
  -  Ustaw nazwe pliku na "downloaded-image.png". 
  -  Następnie zapisz plik.
- Jeżeli wszystko wykonałeś poprawnie to na konsoli wyświetlą się napisy takie jak w pliku "image.png".

# Zadanie 4 - Synchronizacja wiadomości
Zaimplementuj funkcję addMessage() z klasy UpdateCenter, której zadaniem jest dodawanie jednej wiadomości (gdzie 'messagePath' jest unikalną ścieżką do wiadomości przechowywanej na serwerze) do wszystkich użytkowników danej grupy. 
```
public void addMessage(ArrayList<Integer> ids, String messagePath){}
```
- Zadanie polega na dodaniu zmiennej 'messagePath' do HashMapy 'messages', której kluczami mają być elementy ArrayList 'ids'.
- UWAGA: Jeżeli klucz HashMapy 'messagges' istnieje, to należy do wartości tego klucza (którą jest ArrayList) dodać zmienną 'messagePath'.
Sposób testowania:
- Uruchom klase Server
- Uruchom klase LoginGUI
- Kliknij przycisk 'Sign up' -> utworzą się dwaj użytkownicy:
  - email: user, hasło: 1234
  - email: user2, hasło: 1234
- Zaloguj się na jedno konto (przycisk 'Sign In')
- Uruchom klase LoginGUI2
- Zaloguj się na drugie konto

# Zadanie 5 - Elementy realizacji GUI
W klasie newMainPanel zostało utworzonych kilka czatów. Wykonaj następujące działania:
- Po naciśnięciu przycisku 'Render it !' W Jlist powinna wyświetlić się lista utworzonych czatów wraz z ich avatarami. Wykorzystaj klasę ChatRenderer do wyświetlania avatarów.
- Dokończ implementację przycisku 'Delete', który usunie z Jlisty wcześniej zaznaczony Chat.
# Zadanie 6 - Bezpieczeństwo
Zadanie polega na poprawnym uwtorzeniu SSLSocket (w klasie Client) i SSLServerSocket (klasa Server) oraz potwierdzenie tego poprawnym przesłaniem wiadomości.  
W tym celu:
- Odszukaj w folderze /Java/bin/keytool.exe 
- Wygeneruj klucz następującą komendą: 
```
keytool -genkey -keystore yourKEYSTORE -keyalg RSA
```
- Jako hasło ustaw "password", dokończ konfigurację, wygenerowany plik umieść w folderze src
- Dokonaj potrzebnych zmian w kodzie \
- Sposób uruchamiania:
  - Skompiluj klasy Server i Client
  - Uruchom Server następującą komendą: 
```
java -Djava.protocol.handler.pkgs=com.sun.net.ssl.internal.www.protocol Server
```
  - Uruchom Client następującą komendą:
```
java Client
```
-  Efektem powinno być pojawienie się w konsoli Clienta i Servera komunikatów potwierdzających wysłanie i odebranie wiadomości.
