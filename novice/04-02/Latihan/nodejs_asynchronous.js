const fs = require('fs');
fs.readFile('/file.md', (err, data) => {
  if (err) throw err;
});