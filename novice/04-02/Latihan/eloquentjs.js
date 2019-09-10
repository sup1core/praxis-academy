//Callbacks
setTimeout(() => console.log("Tick"), 500);

//Promises
let fifteen = Promise.resolve(15);
fifteen.then(value => console.log(`Got ${value}`));

/*
// 
function storage(nest, name) {
    return new Promise(resolve => {
      nest.readStorage(name, result => resolve(result));
    });
  }
  
  storage(bigOak, "enemies")
    .then(value => console.log("Got", value));

*/

//
new Promise((_, reject) => reject(new Error("Fail")))
  .then(value => console.log("Handler 1"))
  .catch(reason => {
    console.log("Caught failure " + reason);
    return "nothing";
  })
  .then(value => console.log("Handler 2", value));
// → Caught failure Error: Fail
// → Handler 2 nothing

//Networks are hard
class Timeout extends Error {}

function request(nest, target, type, content) {
  return new Promise((resolve, reject) => {
    let done = false;
    function attempt(n) {
      nest.send(target, type, content, (failed, value) => {
        done = true;
        if (failed) reject(failed);
        else resolve(value);
      });
      setTimeout(() => {
        if (done) return;
        else if (n < 3) attempt(n + 1);
        else reject(new Timeout("Timed out"));
      }, 250);
    }
    attempt(1);
  });
}

/*
function requestType(name, handler) {
    defineRequestType(name, (nest, content, source,
                             callback) => {
      try {
        Promise.resolve(handler(nest, content, source))
          .then(response => callback(null, response),
                failure => callback(failure));
      } catch (exception) {
        callback(exception);
      }
    });
  }
  */

  /*
  //Collections of promises
  requestType("ping", () => "pong");

  function availableNeighbors(nest) {
    let requests = nest.neighbors.map(neighbor => {
      return request(nest, neighbor, "ping")
        .then(() => true, () => false);
    });
    return Promise.all(requests).then(result => {
      return nest.neighbors.filter((_, i) => result[i]);
    });
  }
  */

  