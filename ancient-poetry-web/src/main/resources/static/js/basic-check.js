$(function() {
    $('#doc-vld-msg').validator({
        onValid: function(validity) {
            $(validity.field).closest('.am-form-group').find('.am-alert').hide();
        },

        onInValid: function(validity) {
            var $field = $(validity.field);
            var $group = $field.closest('.am-form-group');
            var $alert = $group.find('.am-alert');
            // 使用自定义的提示信息 或 插件内置的提示信息
            var msg = $field.data('validationMessage') || this.getValidationMessage(validity);

            if (!$alert.length) {
                $alert = $('<div class="am-alert am-alert-danger"></div>').hide().
                appendTo($group);
            }

            $alert.html(msg).show();
        }
    });
});