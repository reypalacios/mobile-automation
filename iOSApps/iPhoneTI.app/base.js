/**
    Define our global BI variable (and organization methods)
    This is a singleton defined using the Revealing Module Pattern

    @module base
    @requires jquery
**/
/**
    Provides utility methods for adding features to the global object
    @class BI
    @static
**/

(function($, window, undefined) {
    var exposed;

    /**
        Takes a dot-deliminated (string) and ensures it exists on global BI object
        http://elegantcode.com/2011/01/26/basic-javascript-part-8-namespaces/

        @method namespace
        @param {String} dot.deliminated.namespace
        @return {Object} parent of namespace (allows direct assignment)
    **/
    function namespace(namespaceString) {
        var parts = namespaceString.split('.'),
            parent = exposed,
            currentPart = '';

        for (var i = 0, length = parts.length; i < length; i++) {
            currentPart = parts[i];
            parent[currentPart] = parent[currentPart] || {};
            parent = parent[currentPart];
        }
        return parent;
    }

    /**
        Examines window.location.host to determine if on stage or www (typically used for CDN-switching)

        @method inProduction
        @return {boolean} if currently in a production environment
    **/
    function inProduction() {
        return !(window.location.host.split(".")[0] == "www" || window.location.host.split(".")[0] == "stage");
    }

    function CDNPath(filePath) {
        var CDNServers = [
            'static1',
            'static2',
            'static3',
            'static4',
            'static5',
            'static6'
        ];
        return 'http://'+CDNServers[Math.floor(Math.random()*CDNServers.length)]+'.techinsider.io'+filePath;
    }

    exposed = {
        namespace: namespace,
        inProduction: inProduction,
        CDNPath: CDNPath
    }

    window.BI = window.BI || exposed;

})($, window);