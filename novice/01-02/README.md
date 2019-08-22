### Create Jar File
```
jar cvfe Smartphone.jar Smartphone Smartphone.class
```

### CRC Cards for Smartphone (Parent)
| Object     | Variable/Attribute | Function |
|------------|--------------------|----------|
| Smartphone | Color              | getColor |
|            | ram=8              | getRam   |
|            |                    |          |

### CRC Card for Apple (Child)
| Class Name | Responbilities         | Colaborators         |
|------------|------------------------|----------------------|
| Apple      | displayResolution=1280 | getDisplayResolution |
|            | Merk                   | getMerk              |
|            | batteryCapacity=4000   | getBatteryCapacity   |

### CRC Card for iPhone8 (Child)
| Class Name | Responbilities | Colaborators |
|------------|----------------|--------------|
| Iphone     | seri           | getSeri      |


### Grandle
**Building Java Applications**
1. buat directory dan kemudian masuk ke directory tersebut
2. _grade init_ untuk initialize project
3. Pilih 2 (Application) --> 3 (Java) --> 1 (Grovy) --> 1 (JUnit 4)
4. Masukan nama projek dan package
5. Ketikan command _./gradlew build_ dan selanjutnya _./gradlew run_ untuk melihat hasilnya
