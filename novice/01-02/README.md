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
