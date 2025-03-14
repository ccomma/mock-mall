package com.mockmall.commonbase.exception;

import com.mockmall.commonbase.result.Result;

/**
 * 业务异常
 *
 * @author ccomma
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = -1795382745743646528L;

    /**
     * 异常业务编码
     */
    private final String code;

    public BizException() {
        super();
        code = null;
    }

    /**
     * 根据异常信息和原生异常构造对象.
     *
     * @param code    错误码
     * @param message 异常信息.
     * @param cause   原生异常.
     */
    public BizException(final String code, final String message, final Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    /**
     * 根据异常信息和原生异常构造对象.
     *
     * @param message 异常信息.
     * @param cause   原生异常.
     */
    public BizException(final String message, final Throwable cause) {
        super(message, cause);
        code = null;
    }

    /**
     * 根据原生异常构造对象.
     *
     * @param cause 原生异常.
     */
    public BizException(final Throwable cause) {
        super(cause);
        code = null;
    }

    /**
     * 根据异常信息构造对象.
     *
     * @param message 异常信息.
     */
    public BizException(final String message) {
        super(message);
        code = null;
    }

    /**
     * 根据异常构造业务对象，设置 编码及 消息
     *
     * @param code    错误码
     * @param message 异常信息
     * @author zxh 槟榔
     */
    public BizException(final String code, final String message) {
        super(message);
        this.code = code;
    }

    public BizException(Result<?> result) {
        super(result.getMessage());
        this.code = result.getCode();
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public String getCode() {
        return code;
    }

}
