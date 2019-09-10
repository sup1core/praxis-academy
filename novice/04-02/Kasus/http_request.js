const request = require('request');

request('https://api.nasa.gov/planetary/apod?api_key=aPHesAH2fAlaYAAjVabbsudjecmMisyMG2ng9MaM',{
    json: true }, (err, res, body) => {
        if (err) {
            return console.log(err);
        }
        console.log(body.url);
        console.log(body.explanation);
        console.log(body);
    });