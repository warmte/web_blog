module.exports = {
    devServer: {
        port: 80,
        proxy: {
            "/": {
                target: "http://localhost:8090"
            }
        }
    }
};
