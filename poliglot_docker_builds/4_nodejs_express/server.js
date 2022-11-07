const express = require('express')
const os = require('os');

const PORT = 8080
const app = express()
app.get('/', (req, res) => {
    res.send(`Hello World`)
})
app.listen(PORT)
console.log(`Running on http://localhost:${PORT}`)
