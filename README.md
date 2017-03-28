# Komunikasi Antar Fragment Menggunakan Interface

deklarasi interface pada class <code>Fragment A</code> dengan nama interface <code>OnFragmentAChangeListener</code> yang didalamnya terdapat abstract method <code>tambahKata(String kata)</code>.

### Deklarasi interface code

``` java
    public interface OnFragmentAChangeListener{
        public void tambahKata(String kata);
    }
```

# Referensi

- [Communicating with Other Fragments](https://developer.android.com/training/basics/fragments/communicating.html#Implement)
