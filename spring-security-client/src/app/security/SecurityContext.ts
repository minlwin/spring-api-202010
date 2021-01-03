export class SecurityContext {
    private static instance: SecurityContext = new SecurityContext

    private constructor() { }

    loginUser: any

    token: string | null = null

    get login(): boolean {
        return null != this.token && undefined != this.token && this.token != ""
    }

    static get context() {
        return this.instance
    }
}