## PPKWU - Programowanie pod kątem wielokrotnego użycia

## Laboratorium 1 i 2

API przyjmuje dowolny ciąg znaków i **odwraca** oraz **analizuje** podany przez użytkownika parametr pod kątem wybranej usługi.

## Opis zadań
| Metoda | Ścieżka                     | Parametr | Opis                                                    |
|--------|-----------------------------|----------|---------------------------------------------------------|
| GET    | /reverse/                   | {data}   | Zwraca odwrócony ciąg znaków                            |
| GET    | /validate/                  | {data}   | Zwraca nazwę elementów występujących w parametrze       |
| GET    | /length/                    | {data}   | Zwraca długość parametru                                |
| GET    | /contain/whitespace/        | {data}   | Zwraca "true" jeśli ciąg zawiera biały znak             |
| GET    | /contain/uppercase/         | {data}   | Zwraca "true" jeśli ciąg zawiera wielką literę          |
| GET    | /contain/lowercase/         | {data}   | Zwraca "true" jeśli ciąg zawiera małą literę            |
| GET    | /contain/specialsymbol/     | {data}   | Zwraca "true" jeśli ciąg zawiera znak specjalny         |
| GET    | /digit/                     | {data}   | Zwraca "true" jeśli to liczba                           |
| GET    | /count/uppercase/           | {daat}   | Zwraca liczbę wystąpień dużej litery podanym ciągu      |
| GET    | /count/lowercase/           | {data}   | Zwraca liczbę wystąpień małej litery w podanym ciągu    |
| GET    | /count/whitespaces/         | {data}   | Zwraca liczbę wystąpień białych znaków w podanym ciągu  |

## Przykłady wywołania
* Zadanie 1 - odwrócienie podanego ciągu znaku w parametrze
```
  http://localhost:8080/reverse/testowy
  
  dane wejściowe: testowy
  dane wyjściowe: ywotset
```
* Zadanie 2 - zwrócenie nazwy elementów występujących w podanym parametrze
```
  http://localhost:8080/validate/Testowy1234*
  
  dane wejściowe: Testowy1234*
  dane wyjciowe: big letters | small letters | numbers | special |
```
* Zadanie 2 - wykrzystanie przykładowej pojedynczej usługi
```
  http://localhost:8080/contain/uppercase/TESTOWY
  
  dane wejściowe: TESTOWY
  dane wyjściowe: true
```
```
  http://localhost:8080/contain/uppercase/TEstoWY1234  
  
  dane wejściowe: TEstoWY1234 
  dane wyjściowe: true
```
```
  http://localhost:8080/contain/uppercase/1234
  
  dane wejściowe: 1234
  dane wyjściowe: false
```
```
  http://localhost:8080/digit/testowy67
  
  dane wejściowe: testowy67
  dane wyjściowe: false
```
```
  http://localhost:8080/count/uppercase/TeSt
  
  dane wejściowe: TeSt
  dane wyjściowe: 2
```
* Zadanie 2 - Swagger UI - przejrzysta wizualizacja zasobów API
```
  http://localhost:8080/swagger-ui.html
```
